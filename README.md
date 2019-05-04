# social-new-reader-mod3
A project to read output from mod1 and mod2 and accordingly add the HTML element tags to the same

## Getting Started

-download git repository '
https://github.com/pri987vijay/social-new-reader-mod3.git

# Project Title
Social News Reader

# Project Description
The project consists following scala files mentioned below"
1) Main.scala - Main class where the process inititates
2) util.Utility.scala - This class consists the utility funtions to generate the final output
3) Tag.scala - This is the trait (interface) class which defines the common attributes to be declared by child classes
4) EntityTag.scala - This is a case class extends trait class and declare the HTML tag - Entity 
5) LinkTag.scala - This is a case class extends trait class and declare the HTML tag - Link 
6) TwitterLinkTag.scala - This is a case class extends trait class and declare the HTML tag - Twitter username

# Note: Here, the design of this project support all the upcoming requirements. Simply creating a new case class and respective inputs coming from mod1 and mod2 (main.scala) would suffice all the future requrements (adding/modify the new/current tags).

### Prerequisites

- install sbt

### Installing

1) Clone the git repository (path mention above)
2) Open the project in IDE (intelliJ)
3) Build the project - sbt clean assembly
3) Run the project - sbt run

## Deployment

Add additional notes about how to deploy this on a live system

## Authors

* **Priyanka Vijay** - *Initial work* - (https://github.com/pri987vijay)
