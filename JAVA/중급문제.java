
~~~java
1.
 public static boolean isNum(int max){
        final int standardVal = 10;
        if(max < standardVal){
            return true;
        }
        return false;
    }
	
    public static int getSum(int start, int end){
        int array[] = {3,8,9};
        int max = 0;
        if(start < 0) {
        	if(end == array.length)	
        for(int i=start; i<end; i++){
            //로직 구현
        	if(array[i] < 10) {
        		return 0;
        	}
        }
        }
        return max;
    }
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int max = getSum(start, end);
        boolean isFlag = isNum(max);
        System.out.print(isFlag);
    }
~~~

~~~java
2.
 public static int[] getResult(int[] array){
		for(int i=0; i<array.length;++i) {
			if((array[i]%2) != 0) {
				array[i] = 0;
				if(array[i]< 300) {
					return array;
				}
			}
		}
        return array;
    }

    public static void main(String[] args) {
        int array[] = {120, 340, 200, 430, 33};
        int result[] = getResult(array);
        for(int i : result){
            System.out.print(i+", ");
        }
    }
~~~

~~~java
3.
public static int getResult(String[] array){
		String word[] = array;
		String word2;
		int min = 0;
		for(int i=0; i< word.length; ++i) { 
			word2 = word[i].replace("!", "");
			int x = Integer.parseInt(word2);
			if(word.length < 1) 
				min = x ;
			      if(min >= 200) 
			    	  return 100;
			      if(min <= 200)
			    	  return 100;
			       
			 
		}return min;																		
	}    
	
	public static void main(String[] args) {
	   String array[] = {"100","1!30","11$0","200"};
	   int result = getResult(array);
	   System.out.println(result);
	   }
~~~

~~~java
4.
public static int calcPage(int totalCount, int rows) {		
		int pages =0;
		if(totalCount <= 100) {
			pages = totalCount/ rows;
			if((totalCount / rows) !=0) {
				pages = totalCount/ rows+1;
			}if(totalCount <10) 
				pages = 1;			
		}return pages;
	}
   
    

    public static void main(String[] args) {
        int totalCount = 58; //총 인원값
        int rows = 10; //1페이지에 작성할 수 있는 기준값
        int pages = calcPage(totalCount, rows);
        System.out.println(pages+" 페이지");
    }
~~~
~~~java
    5.
 public static void main(String[] args) {
        String phone = "017-404-1234";
        String array[] = phone.split("-");
        if(array[0] != "010") {
        	System.out.println("핸드폰 번호를 변경해야 합니다.");
        	array[0] = "010-";
        }        
        int len = array[1].length();
        if(len <= 3) {
        	array[1]= "xxx-";
        }len =array[2].length();
        if(len <=4) {
        	array[2]= "xxxx";
        }
        
        
        
        
		for(String str : array){
			System.out.print(str);
		}
   }
~~~
6.
~~~java 
 public static void main(String[] args) {
        String scores = "80, 70, 100, 31";
        String[] stream = scores.split(",");
        int len = 0; //과목 수
        len = stream.length;
        int sum = 0;
        for(int i = 0; i <len; ++i) {
        	String scores1 = stream[i].replace(" ","");
        	int num = Integer.parseInt(scores1);
        	sum = sum + num;
        	if(num == 100) {
        		System.out.println("100점 만점에 100점!");
        		
        	}
        }
                                
                                        
        System.out.print("총점 : "+sum);
        System.out.print("총점 : "+sum /len);
        
    }
~~~
7.
~~~java

                    String query = "name=brian&addr=daejeon&age=30";
	        String name = "";
	        String addr = "";
	        String array[] = query.split("&");
	        String query1;	        
	        int age = 0;
	        int len = 0;
	        len = array.length;
	        for(int i =0; i<len; ++i) {
	        query1 = array[0].replace("name=", "");
	        String query2 = array[1].replace("addr=", "");
	        String query3 = array[2].replace("age=","");
	        name = query1;
	        addr = query2;
	        int x = Integer.parseInt(query3);
	        age = x;
	        
	        
	        }
	        
	        
	        
	        
	        System.out.print(" name : "+name);
	        System.out.print(" addr : "+addr);
	        System.out.print(" age : "+age);
	    }
~~~
~~~java
7.
public static void main(String[] args) {
	        String query = "name=brian&addr=daejeon&age=30";
	        String name = "";
	        String addr = "";
	        String array[] = query.split("&");
	        String query1;	        
	        int age = 0;
	        int len = 0;
	        len = array.length;
	        for(int i =0; i<len; ++i) {
	        if(i == 0) {
	        query1 = array[i].replace("name=", "");
	        name = query1;
	        }
	        if(i==1) {
	        String query2 = array[i].replace("addr=", "");
	        addr = query2;
	        }
	        if(i==2) {
	        String query3 = array[i].replace("age=","");
	        int x = Integer.parseInt(query3);
	        age = x;}
	        
	        
	        }
       
	        System.out.println(" name : "+name);
	        System.out.println(" addr : "+addr);
	        System.out.print(" age : "+age);
	    }
~~~
~~~java
        선생님 문제풀이 - 7번
        String query = "name=brian&addr=daejeon&age=30";
	        String name = "";
	        String addr = "";
	        String array[] = query.split("&");
	        String query1;	        
	        int age = 0;
	        int len = 0;
	        len = array.length;
	        for(int i =0; i<len; ++i) {
	        String temp[] = array[i].split("=");
	        if(i == 0) {	        
	        name = temp[i];
	        }
	        if(i==1) {	        
	        addr = temp[i];
	        }
	        if(i==2) {	      
	        int x = Integer.parseInt(temp[i-1]);
	        age = x;}
	        
	        
	        }
			~~~
~~~java
        선생님 풀이6번
        public static void main(String[] args) {
        String scores = "80, 70, 100, 31";
        String[] array = scores.split(",");
        int len = array.length; //과목 수
        
        int sum = 0;
        for(int i = 0; i <array.length; ++i) {
        	String temp = array[i].trim();
        	sum = Integer.parseInt(temp);
        	sum = sum + Integer.parseInt(temp);
        	
        	if(sum == 100) {
        		System.out.println("100점 만점에 100점!");
        		
        	}
        }
                                
                                        
        System.out.print("총점 : "+sum);
        System.out.print("총점 : "+sum /len);
	}
~~~
~~~java
    선생님 풀이 5번
    public static void main(String[] args) {
	        String phone = "017-404-1234";
	        String array[] = phone.split("-");
	        for(int i=0; i<array.length; ++i) {
	        int len = array[i].length();
	        if(i==0 && !array[i].equals("010")) {
	        	System.out.println("핸드폰 번호를 변경해야 합니다.");
	        	array[0] = "010-";
	        }if(i > 0) {        	        
	        if(len == 3) {
	        	array[1]= "xxx-";
	        }
	        if(len ==4) {
	        	array[2]= "xxxx";
	        }
	        
	        }  
	        }
	        
			for(String str : array){
				System.out.print(str);
			}
	   }
~~~
       