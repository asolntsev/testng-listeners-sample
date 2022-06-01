# A project for reproducing issue with listeners in TestNG 7.5

(compared to 7.4.0)

### How to reproduce the problem
Command `mvn test` should fail.
* It fails (as expected) with TestNG 7.4.0, but
* it's green with TestNG 7.5 - and this is a bug!

### Explanation
Problem the problem was introduced in https://github.com/cbeust/testng/issues/2558 (but I am not sure).
