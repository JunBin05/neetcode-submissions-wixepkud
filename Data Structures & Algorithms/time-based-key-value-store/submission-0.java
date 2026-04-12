class TimeMap {

    class Post{
        String value;
        int timestamp;
        public Post(String value, int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }
    }

    HashMap<String, ArrayList<Post>> database;

    public TimeMap(){
        database = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!database.containsKey(key)){
            database.put(key,new ArrayList<Post>());
        }

        database.get(key).add(new Post(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!database.containsKey(key)){
            return "";
        }
        ArrayList<Post> items = database.get(key);
        int left=0, right=items.size()-1, mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if (items.get(mid).timestamp==timestamp){
                return items.get(mid).value;
            }else if (items.get(mid).timestamp<timestamp){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if (right<0){
            return "";
        }else{
            return(items.get(right).value);
        }
    }
}
