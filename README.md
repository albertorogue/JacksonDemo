# JacksonDemo
JSON deserialization exploitation example using Jackson

## Step 1
Go to EvilServer:
``` 
cd EvilServer
```

## Step 2
Compile the exploitation java class:

``` 
javac exp.java
```

## Step 3
Start the server:

``` 
python -m http.server
```

## Step 4
Execute JacksonDemo to exploit the vulnerability (it will invoke the remote class from the evil server which will open a calculator app in the vulnerable machine)
