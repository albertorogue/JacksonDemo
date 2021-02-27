# JacksonDemo
Json deserialization exploitation example using Jackson

## Step 1
Compile evil java class that will be loaded remotely to the vulnerable machine:

``` 
javac exp.java
```

## Step 2
Start a server:

``` 
python -m http.server
```

## Step 3
Execute JacksonDemo to exploit the vulnerability (it will open a calculator app in the vulnerable machine)
