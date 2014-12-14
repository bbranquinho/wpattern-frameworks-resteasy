package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class RequestBean extends BaseBean {

	private static final long serialVersionUID = 201210191109L;

	private int value1;

	private int value2;

	public RequestBean() {
	}

	public RequestBean(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public int getValue1() {
		return this.value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return this.value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

}
