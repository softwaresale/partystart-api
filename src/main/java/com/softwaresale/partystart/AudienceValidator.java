package com.softwaresale.partystart;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

public class AudienceValidator implements OAuth2TokenValidator<Jwt> {

	private final String audience;
	
	public AudienceValidator(String audience) {
		this.audience = audience;
	}
	
	@Override
	public OAuth2TokenValidatorResult validate(Jwt token) {
		OAuth2Error error = new OAuth2Error("invalid_token");
		
		if (token.getAudience().contains(this.audience)) {
			return OAuth2TokenValidatorResult.success();
		}
		
		return OAuth2TokenValidatorResult.failure(error);
	}

}
