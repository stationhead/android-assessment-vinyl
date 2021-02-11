# Stationhead Android Takehome Assessment

#### Welcome!
We created this project to test your Android skills through hands-on development. 

Unlike many programming tests, this one is designed to test your abilities in a real-world
environment, as close as possible to your actual day-to-day work.

For this project, we're going to create a toy app for displaying Top 40 charts of a selection 
of music genres and display a skewmorphic representation of a record playing.  
It does not implement music playback.

#### Process
We're distributing this assessment through Github, which we use as part of our development process.
If you're unfamiliar with Git or Github you may want to 
check out [Github's Guides](https://guides.github.com/activities/hello-world/) before attempting the screening.

Follow the steps below to get started on the screening:

##### 1. Get access to the repository and copy it through Github Classroom.

At the bottom of these instructions, there's a link that will let you create a copy of this project repository
through Github Classroom.  _Do Not_ click on that link until you have read and understood all of these
instructions.

We estimate that completing the assessment should take a typical applicant 3-4 hours. 
If you're not finished after 4 hours, you can stop and submit what you have, even if it's unfinished. 
Alternatively, you can keep working longer to finish the prompt, however, you 
must submit your work within 24 hours of starting the assessment. 
Your work doesn't have to be perfect to move on to the next round.

Your time begins when you accept
the assignment through Github Classroom.  You can review these instructions and the mockups
for as long as you'd like before starting the assessment.

##### 2. Clone the repository and open the project.

To begin working on the project, clone the repository to your local machine and open it with Android Studio. 
You'll need to create a new branch for your work. You can call this branch whatever you'd like.
 Once you're on your new branch, open the project.
 
 The project will be mostly empty. There are a few models, and usecases, and some image assets you may need.

##### 3. Follow the instructions below and implement the features.

In general, there are no 'right' answers, as long as the result matches the feature specifications.
However, our codebase is in Kotlin, so you should work in Kotlin and not Java (or Scala, Clojure, etc).

Pre-existing files should not be edited unless they have a `TODO` or other comment indicating where you 
can add code.  In particular, the `GetGenreList` class cannot be modified. 
That class returns as RxJava Observable. You may want to brush up on RxJava if you're not familiar with it.  As a reminder, if you do this before
accepting the assignment through Github classroom, it does not count against your time.

##### 4. Commit your work and submit a Pull Request on Github.
Once you've finished your work, commit it to Git and push it to Github. Once pushed, open the project on Github and submit
a Pull Request from your branch into the `main` branch of the repo. If you did not finish the assessment, include a description
of what features you implemented and what work is still to do. Once you've created the PR, email [Andrew](mailto:andrew@stationhead.com) to let
him know you've completed the task.  It may take up to a week for us to review your work and contact you regarding 
next steps.

#### Rules

You will primarily be evaluated based on whether the app implements the specification below.  
There is no canonical "right" answer as long as the code works.  However,
we will be looking at your source code, and you should proud of it.  It should 
be concise and easy for a reader to understand, and
you should use organize your code similarly to how you would for a larger production app.

You're welcome to use any tools, and consult any resource (including the internet) you'd like during the task.
However, you must submit your own work.  Don't ask for direct help, including over the internet
on Stack Overflow or similar forums. Do not share any part of this
assessment with others or post any part of it on the public internet.

You're welcome to use any external libraries you'd like, just add them to the project's `build.gradle`.
We've already added a few that you may find useful, including RxJava, OkHttp, Retrofit, and Glide.

If you have any questions or need clarification on anything, you can ask me by email.  You should resolve
 these questions before starting, I can't guarantee I'll get back to you before your time expires.

#### Specicifaction:

* When the user opens the app, they see a simple page.  There is a heading `Top 40's` followed by a drop-down menu.

* The drop-down menu should start with placeholder text `select genre . . .`

* When the user opens the drop-down menu, they should see a list of genres.  The data
for this genre list is obtained from the GetGenreList usecase.

* That use case returns a list in no particular order.  The genres should be displayed in descending order by the sum of the last 2 months of streams.

    - _Note: The data in this assessment was captured in February of 2021.  Thus, the last '2 months' should be January 2021 and December 2020_

* When the user selects a genre, the app should fetch the tracklist for that Genre.  There is a `GetTracklist` usecase for this, but
it does not have an implementation.  The Genre data class has the url for the API you'll use to fetch the tracklist over the internet. 

* On selecting a genre, the dropdown menu should close, and show the genre selected by the user.

* Once the genre tracklist is fetched, the app should display the song and artist names in order in a scrollable list below the dropdown.

* If the user selects a new genre from the dropdown, the list should update with the new data once fetched.

* If the user taps one of the tracks, the app should show a record playing animation:

    - The record should animate in from the bottom of the screen.

    - The album art for the track should appear as the label of the record.

    - it should rotate at 45 rpm (revolutions per minute)

    - _Note:  It's not obvious in the mockups, but the spindle hole in the middle of the record should be transparent, and show through to the view below_

* When the record is visible, tapping outside the record should dismiss the record animation.

* Tapping on the record animation should pause (or if paused, restart) the rotation.

* Swiping down on the record image should dismiss it.

* _Note: Audio playback is not required for this task.  You should proceed as if another member of
the team is implementing audio playback and will need to integrate that with your code._

### Figma Mockups:

You can view [UI mockups](https://www.figma.com/file/ZuNVafksTdKGnKig8TSwff/Android-Developer-Test?node-id=0%3A1) 
for some of the screens.  These mockups are intended to supplement the written specification and 
provide stylistic cues.  

You _do not_ need to make your designs a pixel-perfect replica of the mockups.
Nor will you need to find assets not included in the repo (e.g. fonts). For views
or elements not covered by these mockups, you should extrapolate from what's there
and implement them in a manner that you think is best.  Those elements should
have a consistent style with the rest of the app.

---

### ***DO NOT PROCEED UNTIL YOU'RE READY TO START*** 
## *[CLICK HERE TO BEGIN ASSESSMENT](https://classroom.github.com/a/8dEIg2jQ)*
