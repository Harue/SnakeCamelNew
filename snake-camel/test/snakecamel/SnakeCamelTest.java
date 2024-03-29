package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcase文字列を分解() {
		String st = "SnakeCase";
		String actual = SnakeCamelUtil.snakeToCamelcase("snake_case");
assertThat(actual,is(st));
	}
	@Test
	public void camelToSnakecaseu区切る() {
		String st = "snake_camel";
		String actual = SnakeCamelUtil.camelToSnakecase("SnakeCamel");
assertThat(actual,is(st));
	}

}
