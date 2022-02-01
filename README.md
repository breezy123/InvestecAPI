# InvestecAPI

On this API framework BDD is implemented
Under sourcefolder there's only one package with a APIUtility.java class. This class has all the methods for the API class.
In APIUtility.java class we have three methods namely: GetResponseStatus, JsonText and GetAllData.
GetResponseStatus, this method setsup all API calls instances such as 'URL and HttpURLConnection' to initiate connection to request.
JsonText method, gets all the Json data and stores into a String variable.
GetAllData stores all the Json data ina an arraylist
Like in the previous UI repo the same concept applies in BDD.
In the feature file there are only two steps: checking status code and validating whether the name 'R2-D2' has the skin_color white and blue.
