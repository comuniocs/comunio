@CucumberOptions(
        monochrome = true,
        glue = "com.example.all_pc.myapplication",
        format = {"junit:/data/data/com.mytest/JUnitReport.xml", "json:/data/data/com.mytest/JSONReport.json"},
        tags = { "~@wip" },
        dryRun = false,
        features = "features")
public class CucumberTestCase extends AndroidTestCase{}
