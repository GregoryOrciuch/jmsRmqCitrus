package com.dummy;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.junit.JUnit4CitrusTestDesigner;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by gregory on 15/02/17.
 */
public class RabbitMQ extends JUnit4CitrusTestDesigner {

	@BeforeClass
	public static void prepare(){
		System.setProperty("https.protocols","TLSv1.1,TLSv1.2,TLSv1,SSLv3");

	}


	@Test
	@CitrusTest
	public void jmsTry() throws  Exception{

		send("site8Endpoint").payload("blah blah");

		//will throw "Cannot write to AMQP destination" :/
	}
}
