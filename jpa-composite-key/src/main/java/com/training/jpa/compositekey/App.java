package com.training.jpa.compositekey;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testjpa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			
			EventId eventId = new EventId();
			eventId.setEventId(1L);
			eventId.setSourceId(1L);
			
			Event event = new Event();
			event.setId(eventId);
			
			MeetingId meetingId = new MeetingId();
			meetingId.setEventId(eventId);
			meetingId.setMeetingId(1L);
			
			Meeting meeting = new Meeting();
			meeting.setId(meetingId);
			meeting.setEvent(event);
			
			List<Meeting> meetings = new ArrayList<Meeting>();
			event.setMeetings(meetings);
			
			em.persist(event);
			em.persist(meeting);

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}

		System.out.println("It is over");
	}
}
