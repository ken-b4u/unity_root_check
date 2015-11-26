## About
tools to check whether rooted device.

## How to use
``` 
private void Awake()
{
  RootCheckManager.Load();
}
``` 

- At any time
``` 
private void FunctionName()
{
  RootCheckManager.GetInstance().RootCheck();
}
``` 
