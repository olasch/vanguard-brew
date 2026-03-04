package io.code.vanguard.brew;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("The Set Kata Master Suite")
@SelectPackages("io.code.vanguard.brew")
@IncludeTags("Set")
public class SetKatasSuite {
}