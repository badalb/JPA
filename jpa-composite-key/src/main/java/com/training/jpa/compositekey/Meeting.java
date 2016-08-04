package com.training.jpa.compositekey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "MEETING")
public class Meeting {

	@EmbeddedId
	private MeetingId id;

	@MapsId("eventId")
	@JoinColumns({ @JoinColumn(name = "EventID", referencedColumnName = "EventID"),
			@JoinColumn(name = "SourceID", referencedColumnName = "SourceID") })
	@ManyToOne
	private Event event;

	public MeetingId getId() {
		return id;
	}

	public void setId(MeetingId id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}