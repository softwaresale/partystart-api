package com.softwaresale.partystart.event;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.softwaresale.partystart.group.EventGroup;

@Entity
public class Event {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String description;
	private String location;
	
	@Column(name = "when_timedate")
	private LocalDateTime when;
	
	@ManyToOne
	@JoinColumn(name = "owner_group")
	private EventGroup group;

	public Event() {
		this("", "", "", LocalDateTime.now());
	}
	
	public Event(String name, String description, String location, LocalDateTime when) {
		super();
		this.name = name;
		this.description = description;
		this.location = location;
		this.when = when;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDateTime getWhen() {
		return when;
	}

	public void setWhen(LocalDateTime when) {
		this.when = when;
	}

	public Long getId() {
		return id;
	}
}
