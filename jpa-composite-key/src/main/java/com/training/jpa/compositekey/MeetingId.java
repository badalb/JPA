package com.training.jpa.compositekey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MeetingId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5704187608357310972L;

	@Column(name = "MeetingID")
	private Long meetingId;

	private EventId eventId;

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public EventId getEventId() {
		return eventId;
	}

	public void setEventId(EventId eventId) {
		this.eventId = eventId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((meetingId == null) ? 0 : meetingId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeetingId other = (MeetingId) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (meetingId == null) {
			if (other.meetingId != null)
				return false;
		} else if (!meetingId.equals(other.meetingId))
			return false;
		return true;
	}

}