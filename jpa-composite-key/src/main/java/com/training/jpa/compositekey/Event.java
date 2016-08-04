package com.training.jpa.compositekey;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EVENT")
public class Event {

	@EmbeddedId
	private EventId id;

	@OneToMany(mappedBy = "event")
	private List<Meeting> meetings = new ArrayList<Meeting>();

	public EventId getId() {
		return id;
	}

	public void setId(EventId id) {
		this.id = id;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}

}
