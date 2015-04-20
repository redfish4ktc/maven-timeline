/**
 * Copyright (C) 2015 david@gageot.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

void log(String msg) { System.out.println(msg) }  
 
log("Checking timeline file generation");

File timeline = new File(basedir, "target/timeline.html");
log("Checking if " + timeline + " exists");
if (!timeline.exists()) {
  throw new AssertionError("The timeline file has not been generated! " + timeline);
}

log("The file exists, test OK");
return true;
