var ajax = function(url, method, data, dataType, success, fail) {
	obj = {
		url: url,
		method: method
	};
	if(data) {
		obj.data = data;
	}
	if(dataType) {
		obj.dataType = dataType;
	}
	
	var request = $.ajax(obj);
	if(success) {
		request.success = success;
	}
	if(fail) {
		request.fail = fail;
	}
}
