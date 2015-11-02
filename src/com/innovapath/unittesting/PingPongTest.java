//Test for pingpong.java

package com.innovapath.unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovapath.programingpractice.PingPong;

public class PingPongTest {

	@Test(description = "Testcase for number div by 3, print ping")
	public void testPingPongDivBy3() {
		Assert.assertEquals(PingPong.printPingPong(9), "ping");
	}

	@Test(description = "Testcase for number div by 5, print pong")
	public void testPingPongDivBy5() {
		Assert.assertEquals(PingPong.printPingPong(10), "pong");
	}

	@Test(description = "Testcase for number div by 3 and 5, print ping pong")
	public void testPingPongDivBy3N5() {
		Assert.assertEquals(PingPong.printPingPong(15), "ping pong");
	}

	@Test(description = "Testcase for number not div by 3 or 5, print number")
	public void testPingPongNotDivBy3OR5() {
		Assert.assertEquals(PingPong.printPingPong(13), String.valueOf(13));
	}

	@Test(description = "Testcase for number as input zero, print ping pong")
	public void testPingPongZeroInput() {
		Assert.assertEquals(PingPong.printPingPong(0), "ping pong");
	}

	@Test(description = "Testcase for number as input one, print 0")
	public void testPingPongOneInput() {
		Assert.assertEquals(PingPong.printPingPong(1), String.valueOf(1));
	}
	
	@Test(description = "Testcase for negative number")
	public void testPingPongNegInput() {
		Assert.assertEquals(PingPong.printPingPong(-3), "ping");
	}

}
