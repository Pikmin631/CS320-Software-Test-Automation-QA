# CS320-Software-Test-Automation-QA

1. How can I ensure that my code, program, or software is functional and secure?

  My approach involves analyzing requirements for their behaviours to descide what my program must support to be functional; this includes
valid and invalid input cases and boundary constraints. When I implent my tests I keep each one independent of my programs responsibilities which I find makes it easier to test. I practice secure code by utilizing encapsulated fields and controlled method updates. I also practice defensive coding by assuming inputs are incorrect in my tests. 



2. How do I interpret user needs and incorporate them into a program?

  Beaking down user needs and translating them to testable rules is essentially my technique. If a user needs a password to be less than 10 characters I translate password.length < 10. I then need to establish what the acceptance criteria looks like to know when my program is "done". This comes organically when I design user workflows to imagine how the user will interact with my program and then build for that interaction. 


3. How do I approach designing softare?

  I've found listing the requirments out and finding the problems that the user is wanting to solve is the best approach. 
Once I have an idea of the behaviours I can decide how to represent data and form rules to support the behaviour. When I design I think of 
maintainability such as keeping my code clear to understand with consistent naming, appropriate comments, methods for one task, etc. 
I think of how a tester could break my program and aim to build for all possible edge cases early. I can also coe accross hints if I am unable to test 
something it may need to be simplified. 
