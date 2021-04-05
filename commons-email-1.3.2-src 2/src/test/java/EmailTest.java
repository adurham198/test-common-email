package org.apache.commons.mail;
//Anton Durham CIS 376 - Win 2021
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private static final String[] TEST_EMAIL = { "ab@bc.com", "a.b@c.org",
			"abcdefghijkl@abcjdwje.com.bd" };
	private static final String TEST_HEADER_NAME = "ABS";
	private static final String TEST_HEADER_VAL =  "AVB";
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void teardownEmailTest() throws Exception {
		
	}

    @Test
	public void testAddBcc() throws Exception {
		email.addBcc(TEST_EMAIL);
		
		assertEquals(3, email.getBccAddresses().size());
	}
}