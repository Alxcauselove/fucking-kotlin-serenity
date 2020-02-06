package steps

//import io.cucumber.java.en.Given


import cucumber.api.java.en.Given

internal class FirstFeatureSteps {

    @Given("^do anything$")
    fun do_anything() {
        println("First Step")
    }

}