package com.softwaresale.partystart.users;

import java.util.Optional;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserServiceImpl implements UserService {

	private final String clientId = "lbnhN0h5DE7w4KWi4625FuZHcoXXWT1Y";
	private final String clientSecret = "uMh8YJxzoPcbO8SkXgj4oIJAGxjj1peMEV_2CHXBEgXCj-0KDX-Ndqi8jyBJ-NLB";
	private final String audience = "https://softwaresale.auth0.com/api/v2/";
	private final String grantType = "client_credentials";
	
	private TokenResponse token;
	
	private static class TokenRequestObject {
		@JsonProperty("client_id")
		private String clientId;
		@JsonProperty("client_secret")
		private String clientSecret;
		private String audience;
		@JsonProperty("grant_type")
		private String grantType;
		public TokenRequestObject(String clientId, String clientSecret, String audience, String grantType) {
			super();
			this.clientId = clientId;
			this.clientSecret = clientSecret;
			this.audience = audience;
			this.grantType = grantType;
		}
	}
	
	private static class TokenResponse {
		@JsonProperty("access_token")
		private String accessToken;
		@JsonProperty("token_type")
		private String tokenType;
		
		public TokenResponse() {
		}
		
		public TokenResponse(String accessToken, String tokenType) {
			super();
			this.accessToken = accessToken;
			this.tokenType = tokenType;
		}
		public String getAccessToken() {
			return accessToken;
		}
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}
		public String getTokenType() {
			return tokenType;
		}
		public void setTokenType(String tokenType) {
			this.tokenType = tokenType;
		}
	}
	
	public UserServiceImpl() {
		
		// Request oauth bearer token
		RestTemplate tokenRequest = new RestTemplate();
		TokenRequestObject trq = new TokenRequestObject(clientId, clientSecret, audience, grantType);
		HttpEntity<TokenRequestObject> reqEntity = new HttpEntity<UserServiceImpl.TokenRequestObject>(trq);
		ResponseEntity<TokenResponse> response = tokenRequest.postForEntity("https://softwaresale.auth0.com/oauth/token", reqEntity, TokenResponse.class);
		
		// Save the token
		this.token = response.getBody();
	}
	
	private HttpHeaders getAuthHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", String.format("Bearer %s", token.getAccessToken()));
		return headers;
	}
	
	private HttpEntity<Void> getEmptyRequest() {
		return new HttpEntity<Void>(this.getAuthHeaders());
	}

	@Override
	public Optional<Auth0User> getUserById(String id) {
		
		RestTemplate template = new RestTemplate();
		HttpEntity<Void> request = this.getEmptyRequest();
		String uri = String.format("https://softwaresale.auth0.com/api/v2/users/%s", id);
		ResponseEntity<Auth0User> response = template.exchange(uri, HttpMethod.GET, request, Auth0User.class);
		
		if (response.hasBody())
			return Optional.of(response.getBody());
		else
			return Optional.empty();
	}

}
