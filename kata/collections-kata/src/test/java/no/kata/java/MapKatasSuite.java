package no.kata.java;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("The Map Kata Master Suite")
@SelectPackages("no.kata.java")
@IncludeTags("Map")
public class MapKatasSuite {
}