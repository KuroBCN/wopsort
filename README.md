# Java Interview Template
This repository is a simple template for programming interviews in Java, including Junit 4 test templates.

## Goals
The goals of this template are:
- Simplicity
- Ready to implement 
- Quick test writing
- Command line interface

### Simplicity 
In order to keep the project simple for both the interviewer and interviewees, the project structure is flat with only a separation between source and test files. The directory structure is:

```
- lib
    - junit-4-7.jar
- out
    - main
    - test
- src
- test
```

### Ready to implement
This project is ready to implement the algorithm given to the interviewee. It provides a Main class and a helper class template called Palindrome. You should implement your algorithm in the Palindrome class (renaming as appropriate) and call your class implementation from the Main class.

Before submitting you should delete this README.md and replace it with README.sample, customizing it for your interview problem.

## Quick test writing
Before or after you write your algorithm (depending on your TDD approach) you can quickly add tests for your code in the test/MainTest and test/PalindromeTest files. You should be sure that you cover all possible test cases before submitting.

## Command line interface
Many interview questions require that the program and/or tests be run from the command line. Many times this also requires that arguments are passed in. For this reason there are two scripts included: `run.sh` and `test.sh` which will compile the source files to `out/` and run the program or tests respectively. 

`run.sh` will run the program, passing along any arguments given to it, as in:

```bash
$ ./run.sh 12
Is not palindrome

$ ./run.sh 121
Is palindrome
```

`test.sh` will run the tests under the `test/` directory:

```bash
$ ./test.sh
JUnit version 4.7
........
Time: 0.015

OK (8 tests)
```
 
Note: If you add additional test files to `test/` you will need to include their class names in `test/JunitTestSuite`.

## Submitting
When submitting the project you should exclude any git files, compiled source files, and this README.md (but provide your own README.md). The files you should include are:

```
- lib
    - junit-4-7.jar
- src/*
- test/*
README.md
LICENSE.md
run.sh
test.sh
```
