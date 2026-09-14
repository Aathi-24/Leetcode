class BrowserHistory {
    public List<String> list;
    public int cur;
    public int max;
    public BrowserHistory(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        cur = 0;
        max = 0;
    }
    
    public void visit(String url) {
        cur++;
        if(cur < list.size()){
            list.set(cur, url);
        }
        else{
            list.add(url);
        }
        max = cur;
    }
    
    public String back(int steps) {
        cur = Math.max(0, cur - steps);
        return list.get(cur);
    }
    
    public String forward(int steps) {
        cur = Math.min(max, cur + steps);
        return list.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */