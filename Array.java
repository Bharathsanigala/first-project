

public class Array  {

    public static void getMessage(){
        String[] arr = {
            "hello", "hi", "bye", "good morning", "good night", 
            "how are you?", "what's up?", "see you later", "take care", 
            "thank you", "you're welcome", "please", "sorry", 
            "excuse me", "congratulations", "good luck", "happy birthday", 
            "happy anniversary", "best wishes", "get well soon", 
            "nice to meet you", "long time no see", "welcome", 
            "how's it going?", "what's new?", "I appreciate it", 
            "my pleasure", "no problem", "of course", "sure thing", 
            "absolutely", "I understand", "that sounds great", 
            "I agree", "I see your point", "let's catch up", 
            "have a good day", "have a great weekend", 
            "what do you think?", "feel free to ask", 
            "let me know", "I'm here for you", "I miss you", 
            "keep in touch", "that's interesting", 
            "I'm proud of you", "you're amazing", 
            "stay safe", "take it easy", "don't worry", 
            "just checking in", "let's celebrate", "let's get together", 
            "good job", "well done", "I'm thinking of you", 
            "you can do it", "let's go", "what's the plan?", 
            "time flies", "let's move forward", "stay positive", 
            "let's not forget", "I'll be there", "how was your day?", 
            "enjoy your meal", "what a surprise", "nice job", 
            "thank you for your help", "you inspire me", 
            "keep it up", "I believe in you", "let's do this", 
            "I'm here to help", "don't hesitate to reach out", 
            "let's keep this going", "you rock", "so proud of you", 
            "you're the best", "let's have fun", "let's make memories", 
            "take it one step at a time", "we'll get through this", 
            "I appreciate your support", "let's brainstorm", 
            "you can count on me", "let's solve this together", 
            "here's to new beginnings", "I'm cheering for you", 
            "we're in this together", "let's take a break", 
            "every day is a gift", "let's create something awesome", 
            "what's on your mind?", "your opinion matters", 
            "let's collaborate", "happy to help", "let's share ideas", 
            "take a deep breath", "it'll be okay", "one day at a time", 
            "let's keep it real", "I'm glad you're here", 
            "let's spread positivity", "keep smiling"
        };
        
        int n = (int)(Math.random()*arr.length);
        System.out.println(arr[n]);
    }
    
}
