### Hard Problems

1. First Missing Positive
   
    Given an unsorted integer array nums, find the smallest missing positive integer.<br>
    <details>
    <summary> Hint/ Solution Detail </summary>

    Refer: https://leetcode.com/problems/trapping-rain-water/ <br>
    [Solution](../src/com/algorhythm/hard/array/FirstMissingPositive.java)
    </details>   
   
2.  Insert Delete GetRandom O(1) - Duplicates allowed

    Implement the RandomizedCollection class:

    RandomizedCollection() Initializes the RandomizedCollection object.<br>
    **bool insert(int val):** Inserts an item val into the multiset if not present. Returns true if the item was not present, false otherwise. <br>
    **bool remove(int val):** Removes an item val from the multiset if present. Returns true if the item was present, false otherwise. Note that if val has multiple occurrences in the multiset, we only remove one of them. <br>
    **int getRandom():** Returns a random element from the current multiset of elements (it's guaranteed that at least one element exists when this method is called). The probability of each element being returned is linearly related to the number of same values the multiset contains.<br>
    _You must implement the functions of the class such that each function works in average **O(1)** time complexity._

   <details>
    <summary> Hint/ Solution Detail </summary>
    
    Refer: https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/ <br>
    [Solution](../src/com/algorhythm/hard/array/InsertDeleteGetRandomWithDuplicates.java)
    </details>   
   
3. Trapping Rain Water
   Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.<br>
   ![img.png](images/traprain.png)

    <details>
    <summary> Hint/ Solution Detail </summary>

    Refer: https://leetcode.com/problems/trapping-rain-water/ <br>
    [Solution](../src/com/algorhythm/hard/array/TrappingRainWater.java)
    </details>   

4. Design In-Memory File System
    Design a data structure that simulates an in-memory file system.

    Implement the FileSystem class:
    
    **FileSystem()** Initializes the object of the system.<br>
    **_List<String> ls(String path)_**<br>
    - If path is a file path, returns a list that only contains this file's name.<br>
    - If path is a directory path, returns the list of file and directory names in this directory.<br>
    - *The answer should in lexicographic order.<br>
    
    _**void mkdir(String path)**_<br> 
    - Makes a new directory according to the given path. The given directory path does not exist. If the middle directories in the path do not exist, you should create them as well.<br>
    
    **_void addContentToFile(String filePath, String content)_**<br>
    - If filePath does not exist, creates that file containing given content.<br>
    - If filePath already exists, appends the given content to original content.<br>
    
    _**String readContentFromFile(String filePath)**_ <br>
    - Returns the content in the file at filePath.<br>
    <details>
    <summary> Hint/ Solution Detail </summary>

    Refer: https://leetcode.com/problems/design-in-memory-file-system/ <br>
    [Solution](../src/com/algorhythm/hard/FileSystem.java)
    </details>