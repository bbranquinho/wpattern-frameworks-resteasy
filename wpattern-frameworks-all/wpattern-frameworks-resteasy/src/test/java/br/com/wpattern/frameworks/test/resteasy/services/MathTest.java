package br.com.wpattern.frameworks.test.resteasy.services;

import org.apache.log4j.Logger;
import org.jboss.resteasy.client.ProxyFactory;
import org.junit.Before;
import org.junit.Test;

import br.com.wpattern.frameworks.resteasy.utils.beans.RequestBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBean;
import br.com.wpattern.frameworks.resteasy.utils.interfaces.IMathRestService;

// Test MathService without spring.
public class MathTest {

	private Logger logger = Logger.getLogger(this.getClass());

	private IMathRestService mathService;

	@Before
	public void setUp() throws Exception {
		this.mathService = ProxyFactory.create(IMathRestService.class, "http://localhost:8080/");
	}

	@Test
	public void testHelloGet() {
		String result = this.mathService.hello();

		if (this.logger.isInfoEnabled()) {
			this.logger.info("Result: " + result);
		}
	}

	@Test
	public void testHelloPost() {
		RequestBean requestBean = new RequestBean(10, 20);
		ResponseBean result = this.mathService.hello(requestBean);

		if (this.logger.isInfoEnabled()) {
			this.logger.info("Result: " + result.getResult());
		}
	}

}
