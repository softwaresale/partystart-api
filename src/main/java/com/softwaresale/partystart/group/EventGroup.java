package com.softwaresale.partystart.group;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.softwaresale.partystart.event.Event;

@Entity
public class EventGroup {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String description;
	
	@OneToMany(mappedBy = "group", targetEntity = Event.class, cascade = CascadeType.ALL)
	private List<Event> events;
	
	public EventGroup() {
		this("", "");
	}
	
	public EventGroup(String name, String description) {
		this(name, description, null, null, "");
	}
	
	public EventGroup(String name, String description, List<Event> events, List<String> memberIds, String adminId) {
		super();
		this.name = name;
		this.description = description;
		this.events = events;
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
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
