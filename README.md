The first step I took in getting Selenium to run, was to create
a new Maven project. Once that was completed, I navigated to the
Selenium website, located at http://www.seleniumhq.org/. I downloaded
Selenium for Java and extracted the files into a new folder. After
that I added the file as an external library to my new Maven project.
At first I walked through a tutorial on youtube, located at
https://www.youtube.com/watch?v=-eJ2cZXyJ0E&t=2658s
for a basic understanding on how Selenium works. At first I was 
running in to two errors. The first error was that I was not
setting where the chromedriver.exe file was located. The second
error was that I did not have the Selenium Standalone Server. Once 
these errors were overcome, I was able to navigate to Indeed.com and
print off the title and number of search results. I took the knowledge
that I gained from the tutorial and applied it to two tests using my
final project website from IT 305. The first test was to ensure that
the program can navigate to my site and ensure that the title of the 
site is correct. The second test runs and tests that if a new user
navigates to the site and attempts to buy something, that they have
zero dollars in their wallet. The second test fails because the user
has " " dollars instead of "0".