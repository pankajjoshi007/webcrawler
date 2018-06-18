# webcrawler

webcrawler is a spring boot application which provides the REST API to crawl the data from http://www.prudential.co.uk/. and produces the JSON based output for all pages within the domain link ,external sites link  and static content such as images for each respective page.
 
## Installation

### Using Maven

	$ mvn clean install

## Run

### Using Spring boot: Copy the executable jar in a folder form target folder and run the below command. 

	$ java -jar webcrawler-0.0.1-SNAPSHOT.jar
	
Once Serve is up please hit the below URL.
	http://localhost:8080/api/webcrawler/sitemap
	
	
## Improvement

### This API Can be improved in below areas.
	We can create the parallel process webcrawler with version tracking approach 
	REST can be enhanced for producing XML and JSON based output.
	outside domain matching pattern link can be improved by regex pattern matching.
	API can have better exceptional handling and logging approach using Spring AOP advices. 

	