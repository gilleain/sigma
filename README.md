# sigma
Exploration of AWS-lambda for graph isomorphism

This is a simple AWS lambda function to determine isomorphism between two graphs.

To use, deploy to AWS and call like:

curl -X POST https://<AWS LOCATION>.amazonaws.com/default/sigma-function-<ID>  
-H 'Access-Control-Allow-Origin : *' 
-H 'Access-Control-Allow-Credentials : true'  
-H 'Content-Type: application/json'    -d '{ "graphA" : "0:1,0:2,1:3,2:3", "graphB" : "0:1,0:3,1:2,2:3" }'

This should then return a result like:

{"isomorphic":true}

for the above example. That's it!
