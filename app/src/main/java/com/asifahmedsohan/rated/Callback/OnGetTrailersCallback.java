package com.asifahmedsohan.rated.Callback;


import com.asifahmedsohan.rated.Model.Trailer;

import java.util.List;

public interface OnGetTrailersCallback {
    void onSuccess(List<Trailer> trailers);

    void onError();
}
