package InvestecAPI.co.za.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static InvestecAPI.co.za.tools.APIUtility.*;

public class CheckColor {
    @Given("^User verifies the HTTP status$")
    public void userVerifiesTheHTTPStatus() {

        Assert.assertEquals(GetResponseStatus(),200);
        System.out.println("HTTP status is: "+ GetResponseStatus());
    }

    @Then("^User checks whether the name correspond skin color is white and blue$")
    public void userChecksWhetherTheNameCorrespondSkinColorIsWhiteAndBlue() {

        Assert.assertTrue(GettAllData()); // check if all data json data is retrieved
        String getColor="";
        for(int x=0; x<count; x++)
        {
            if(jsonArray.getJSONObject(x).getString("name").equalsIgnoreCase("R2-D2")){

                getColor = jsonArray.getJSONObject(x).getString("skin_color");

                Assert.assertEquals(getColor,"white, blue");

                System.out.println(jsonArray.getJSONObject(x).getString("name") +" skin color is "+ jsonArray.getJSONObject(x).getString("skin_color"));
                break;
            }
        }
    }
}
