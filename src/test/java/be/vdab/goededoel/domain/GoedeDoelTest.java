package be.vdab.goededoel.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@Before
	public void before() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	public void getNaam() {
		assertThat(doel.getNaam()).isEqualTo(NAAM);
	}

	@Test
	void eenNieuwDoelHeeftNogGeenOpbrengst() { assertThat(doel.getOpgebracht()).isZero(); }

}
