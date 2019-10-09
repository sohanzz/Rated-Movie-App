package com.asifahmedsohan.rated.Callback;


import com.asifahmedsohan.rated.Model.Movie;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}
