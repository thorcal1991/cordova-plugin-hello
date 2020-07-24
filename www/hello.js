/*global cordova, module*/

module.exports = {
    checkdevelopermode: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CustomCode", "checkdevelopermode", [name]);
    },
    getimei: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CustomCode", "getimei", [name]);
    }
};
