package br.com.wpattern.frameworks.test.resteasy.services;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.frameworks.resteasy.utils.beans.RequestBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBean;
import br.com.wpattern.frameworks.resteasy.utils.interfaces.IMathRestService;
import br.com.wpattern.frameworks.test.resteasy.AbstractTestResteasy;

//Test MathService with spring.
public class MathSpringTest extends AbstractTestResteasy {

	private Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IMathRestService mathService;

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
