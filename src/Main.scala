object Main {
 def main(args: Array[String]): Unit =
 {
  println("test");
 }
  //log actions
  //setup objects (queue, settings, etc)
  //get match last checked time from DB

  //if they haven't been checked today
    //get matches from API
    //save new matches to the DB

  //get matches to search from DB
    //add unique matches to the queue

  //if we have any matches in the queue
    //get match score from API
    //process match interest
    //build match interest tweet
    //send match tweet
    //update match status tweet in DB

}


