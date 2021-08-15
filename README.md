# Demoqa



### TOOLS AND EXPLANATIONS

>1.The project has been prepared based on Cucumber BDD style.
> 
>2.Maven build management tool is used in this project by Java and Javascript languages.
>
>3.In the project that includes 6 features, 10 scenarios and 31 steps. The first scenario verifies submitting from the given address(https://demoqa.com), the second scenario is about handling alerts. Third scenario is about hover over actions. The fourth scenario is about drag and drop an element.The fifth scenario is about pop ups. The last one is about setting the date from the date-picker.
>
>4.A special tag(@wip,@alert,@datePicker,@dragAndDrop,@hoverOver,@closeModals,@submitForm) was used in the project. Thus, the desired feature can be run in Runner. 

### HOW TO RUN
> -<span style="color:red;">></span> Under the runner package "runners" choose "TestRunner" class right click and run . <span style="color:brown;">"src > test > java > com > demoqa > runners > TestRunner"</span>
> 
> -<span style="color:red;">></span> mvn test --<span style="color:red;">></span> in the IDE console or navigate project path <span style="color:red;">in</span> <span style="color:blue;">command</span> line and run.

### HOW TO CREATE TEST REPORTS
1-) When you run tests with the **"mvn verify"** command from the console, you can see **Cucumber Html Reports** under the target file. 
**-> target -> cucumber-html-reports > overview-steps.html** (open with chrome option)

2-) Second type of report, the project is run from **TestRunner** class, a Cucumber Report link is created in the IDE console automatically.(In project report 31 steps passed)

###EXPLANATION ABOUT SOME SCENARIOS
- I consider all the possibilities about given credentials. In submitting form scenario there are some inputs that we need to enter some details. But firstname and last name input accept spaces and numbers.It doesn't give us any error it actually accept.This can be considered as a bug.Because we need to enter valid credentials, not only space or only numbers.

