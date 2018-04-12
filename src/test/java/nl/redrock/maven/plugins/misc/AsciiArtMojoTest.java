package nl.redrock.maven.plugins.misc;

import junit.framework.TestCase;
import nl.redrock.maven.plugins.misc.AsciiArtMojo;

import org.junit.Test;

public class AsciiArtMojoTest extends TestCase {
	
	@Test
	public void testMojo() throws Exception{
		AsciiArtMojo mojo = new AsciiArtMojo();
		mojo.setDeveloperName("RedRock");
		mojo.execute();
	}
}
