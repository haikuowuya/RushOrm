package co.uk.friendlyapps.rushorm.testobjects;

import java.util.List;

import co.uk.rushorm.core.RushObject;
import co.uk.rushorm.core.annotations.RushList;
import co.uk.rushorm.core.annotations.RushRenamed;

/**
 * Created by Stuart on 18/12/14.
 */
@RushRenamed(names = {"co.uk.friendlyapps.rushorm.testobjects.TestBase1"})
public class TestUpgrade3 extends RushObject {
    public String stringField;
    public double doubleField;
    public int intField;
    public long longField;
    public short shortField;
    public boolean booleanField;

    public TestUpgrade5 testBase2;

    @RushList(classname = "co.uk.friendlyapps.rushorm.testobjects.TestUpgrade5")
    public List<TestUpgrade5> testBase2List;
}
