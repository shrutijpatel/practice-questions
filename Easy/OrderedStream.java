class OrderedStream {
    String[] arr;
    int ptr = 0;
    public OrderedStream(int n) {
        arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> chunks = new ArrayList();
        arr[idKey - 1] = value;
        while(ptr < arr.length && arr[ptr] != null){
            chunks.add(arr[ptr++]);
        }
        return chunks;
    }
}
