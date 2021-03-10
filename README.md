# Project 3 - *Parstagram*

**Parstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **10** hours spent in total

## User Stories

The following **required** functionality is completed:

- [X] User can view the last 20 posts submitted to "Instagram".
- [X] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos form camera) and profile tabs (posts made) using fragments and a Bottom Navigation View. (2 points)
- [ ] User can pull to refresh the last 20 posts submitted to "Instagram".

The following **optional** features are implemented:

- [X] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once he or she reaches the bottom of the feed using infinite scrolling.
- [ ] Show the username and creation time for each post.
- [ ] User can tap a post to view post details, including timestamp and caption.
- [ ] User Profiles
      - [ ] Allow the logged in user to add a profile photo
      - [ ] Display the profile photo with each post
      - [ ] Tapping on a post's username or profile photo goes to that user's profile page and shows a grid view of the user's posts 
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

## Video Walkthrough

# Part 1:

Here is a walkthrough of implemented user stories:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part1.gif' width='250' alt='Video Walkthrough' />

Here is the post in the Parse database:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part1_Parse.gif' width='250' alt='Parse Database Lookup' />

Here is a walkthrough for the sign up process:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part1_Signup.gif' width='250' alt='Signup Walkthrough' />

Here are the users in the database after the sign up:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part1_Users.png' width='250' alt='Parse User Lookup' />

Here is a brief showcase of account persisence:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part1_Persistence.gif' width='250' alt='Icon Walkthrough' />

Here is a brief showcase of the app icon in the home screen:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part1_Icon.gif' width='250' alt='Icon Walkthrough' />

# Part 2:

Here is what the app looks like now:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part2.gif' width='250' alt='Icon Walkthrough' />

Here are some minor UI changes I made to the bottom nav bar and post format:

<img src='https://github.com/datguy000/Parstagram/blob/master/Parstagram_Part2_Minor_UI_Changes.png' width='250' alt='Icon Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

I wasn't able to implement everything I wanted to due to exams.

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2021] [CodePath.org]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
