# MyView
自定义控件
```
ItemView iv=findViewById(R.id.ivFirst);
iv.setOnClickView(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "点击事件！", Toast.LENGTH_SHORT).show();
    }
});
```
![Image text](https://github.com/xcocean/MyView/blob/master/picture/gif.gif?raw=true)
