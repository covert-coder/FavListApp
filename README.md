# FavListApp
Comolete Android R course with morteza, new lessons Favorite List App

This App demonstrates the use of an adapter, an AdapterManager, ViewHolder, RecyclerView, SharedPreferences and PreferenceManager.  The user is presented with a UI that
permits the addition of items to a list of categories of favourite things, such as; sports, movies, tv shows, cars, etc..  
Within each category, they can add specific items such as, within sports; soccer, football, hockey,etc..  
The data input by the user is then used to populate a Recycler view linear layout.  RecyclerView built-in properties then permits the user
to scroll the view to see the sequentially created views of categories and their sub lists.
This demonstrates the use of recyclerView but also informs the user in the use of SharedPreferences for non-secure storage of data and
its retrieval.
The use of the Adapter and Adapter Manager compartmentalizes tasks and increases the modularity of the app design thereby isolating data
handling from the MainActivity.  RecyclerViews reduce resource allocation while running the app since only the active views are loaded and
more are only loaded on-demand through user scrolling.

The code has been extensively commented to explain the rational and inter=relatedness of all code and classes.
