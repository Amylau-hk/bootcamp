### Why do we need Mockito?
#### Background 
- Method A -> Method B (You should have 2 unti tests)
  - Unit Test on Method A (mock Method B result)
  - Unit Test on Method B
#### Advantages & Summary:
  - Reduces the number of test cases in Unit Test (Method A)
  - If there is a code change on Method B (main code), you should only revise the test case in Unit test (Methid B) Only
