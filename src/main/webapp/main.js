(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _components_diary_diary_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./components/diary/diary.component */ "./src/app/components/diary/diary.component.ts");
/* harmony import */ var _components_chat_chat_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/chat/chat.component */ "./src/app/components/chat/chat.component.ts");





var routes = [
    { path: '', component: _components_chat_chat_component__WEBPACK_IMPORTED_MODULE_4__["ChatComponent"], pathMatch: 'full' },
    {
        path: 'diary',
        component: _components_diary_diary_component__WEBPACK_IMPORTED_MODULE_3__["DiaryComponent"]
    }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n<div style=\"text-align:center\">\n  <h1>\n    Moi\n  </h1>\n</div>\n\n\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'portfolio ui - chat';
    }
    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var ngx_toastr__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ngx-toastr */ "./node_modules/ngx-toastr/fesm5/ngx-toastr.js");
/* harmony import */ var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/platform-browser/animations */ "./node_modules/@angular/platform-browser/fesm5/animations.js");
/* harmony import */ var _services_socket_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./services/socket.service */ "./src/app/services/socket.service.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _services_diary_service__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./services/diary.service */ "./src/app/services/diary.service.ts");
/* harmony import */ var _components_diary_diary_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/diary/diary.component */ "./src/app/components/diary/diary.component.ts");
/* harmony import */ var _components_chat_chat_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./components/chat/chat.component */ "./src/app/components/chat/chat.component.ts");
/* harmony import */ var _components_chat_message_messageText_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./components/chat/message/messageText.component */ "./src/app/components/chat/message/messageText.component.ts");
/* harmony import */ var _components_chat_message_messageButton_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./components/chat/message/messageButton.component */ "./src/app/components/chat/message/messageButton.component.ts");
/* harmony import */ var _components_chat_message_messageQuickReply_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./components/chat/message/messageQuickReply.component */ "./src/app/components/chat/message/messageQuickReply.component.ts");
















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_6__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_8__["AppComponent"],
                _components_diary_diary_component__WEBPACK_IMPORTED_MODULE_11__["DiaryComponent"],
                _components_chat_chat_component__WEBPACK_IMPORTED_MODULE_12__["ChatComponent"],
                _components_chat_message_messageText_component__WEBPACK_IMPORTED_MODULE_13__["MessageTextComponent"],
                _components_chat_message_messageButton_component__WEBPACK_IMPORTED_MODULE_14__["MessageButtonComponent"],
                _components_chat_message_messageQuickReply_component__WEBPACK_IMPORTED_MODULE_15__["MessageQuickReplyComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_5__["BrowserModule"],
                _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_2__["BrowserAnimationsModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_7__["AppRoutingModule"],
                ngx_toastr__WEBPACK_IMPORTED_MODULE_1__["ToastrModule"].forRoot({ timeOut: 3000 }),
                _angular_forms__WEBPACK_IMPORTED_MODULE_4__["ReactiveFormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_9__["HttpClientModule"]
            ],
            providers: [
                _services_diary_service__WEBPACK_IMPORTED_MODULE_10__["DiaryService"],
                _services_socket_service__WEBPACK_IMPORTED_MODULE_3__["SocketService"]
            ],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_8__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/components/chat/chat.component.css":
/*!****************************************************!*\
  !*** ./src/app/components/chat/chat.component.css ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvY2hhdC9jaGF0LmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/components/chat/chat.component.html":
/*!*****************************************************!*\
  !*** ./src/app/components/chat/chat.component.html ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<h2>Test chat RECAST AI / SAP Conversational AI</h2>\n<ul>\n    <ng-container *ngFor=\"let message of messages\">\n      <app-chat-message-text *ngIf=\"message.type=='text'\" [message]=\"message\"></app-chat-message-text>\n      <app-chat-message-button *ngIf=\"message.type=='buttons'\" [message]=\"message\"></app-chat-message-button>\n      <app-chat-message-quick-reply *ngIf=\"message.type=='quickReplies'\" [message]=\"message\"></app-chat-message-quick-reply>\n    </ng-container>\n</ul>\n  <form [formGroup]=\"messageForm\" (submit)=\"sendMessage()\">\n  <p>Message: </p>\n  <input type=\"text\" formControlName=\"content\" name=\"content\" placeholder=\"Message\">\n  <input type=\"submit\" value=\"Send using socket subscription\">\n</form>\n"

/***/ }),

/***/ "./src/app/components/chat/chat.component.ts":
/*!***************************************************!*\
  !*** ./src/app/components/chat/chat.component.ts ***!
  \***************************************************/
/*! exports provided: ChatComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ChatComponent", function() { return ChatComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _services_socket_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../services/socket.service */ "./src/app/services/socket.service.ts");




var ChatComponent = /** @class */ (function () {
    function ChatComponent(socketService, componentFactoryResolver) {
        this.socketService = socketService;
        this.componentFactoryResolver = componentFactoryResolver;
        this.isLoaded = false;
        this.isCustomSocketOpened = false;
        this.messages = [];
    }
    ChatComponent.prototype.ngOnInit = function () {
        this.messageForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({ content: new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](null, [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]) });
        this.getMessages();
    };
    ChatComponent.prototype.sendMessage = function () {
        if (this.messageForm.valid) {
            this.socketService.sendMessageUsingSocket(this.messageForm.value.content);
        }
    };
    ChatComponent.prototype.getMessages = function () {
        var _this = this;
        this.socketService.getMessages()
            .subscribe(function (messages) { return _this.messages = messages; });
    };
    ChatComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-chat',
            template: __webpack_require__(/*! ./chat.component.html */ "./src/app/components/chat/chat.component.html"),
            styles: [__webpack_require__(/*! ./chat.component.css */ "./src/app/components/chat/chat.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_socket_service__WEBPACK_IMPORTED_MODULE_3__["SocketService"], _angular_core__WEBPACK_IMPORTED_MODULE_1__["ComponentFactoryResolver"]])
    ], ChatComponent);
    return ChatComponent;
}());



/***/ }),

/***/ "./src/app/components/chat/message/message.component.css":
/*!***************************************************************!*\
  !*** ./src/app/components/chat/message/message.component.css ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvY2hhdC9tZXNzYWdlL21lc3NhZ2UuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/components/chat/message/messageButton.component.html":
/*!**********************************************************************!*\
  !*** ./src/app/components/chat/message/messageButton.component.html ***!
  \**********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<li class=\"message message-button\">\r\n    <h3>{{message.content.title}}</h3>\r\n    <ul class=\"button-group\">\r\n        <li *ngFor=\"let button of message.content.buttons\">\r\n            <button (click)=\"quickReply(button.value)\" type=\"button\">{{ button.title }}</button> \r\n        </li>\r\n    </ul>\r\n</li>\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/components/chat/message/messageButton.component.ts":
/*!********************************************************************!*\
  !*** ./src/app/components/chat/message/messageButton.component.ts ***!
  \********************************************************************/
/*! exports provided: MessageButtonComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MessageButtonComponent", function() { return MessageButtonComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_socket_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../services/socket.service */ "./src/app/services/socket.service.ts");



var MessageButtonComponent = /** @class */ (function () {
    function MessageButtonComponent(socketService) {
        this.socketService = socketService;
    }
    MessageButtonComponent.prototype.quickReply = function (message) {
        this.socketService.sendMessageUsingSocket(message);
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", Object)
    ], MessageButtonComponent.prototype, "message", void 0);
    MessageButtonComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-chat-message-button',
            template: __webpack_require__(/*! ./messageButton.component.html */ "./src/app/components/chat/message/messageButton.component.html"),
            styles: [__webpack_require__(/*! ./message.component.css */ "./src/app/components/chat/message/message.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_socket_service__WEBPACK_IMPORTED_MODULE_2__["SocketService"]])
    ], MessageButtonComponent);
    return MessageButtonComponent;
}());



/***/ }),

/***/ "./src/app/components/chat/message/messageQuickReply.component.html":
/*!**************************************************************************!*\
  !*** ./src/app/components/chat/message/messageQuickReply.component.html ***!
  \**************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<li class=\"message message-button\">\r\n\t<h3>{{message.content.title}}</h3>\r\n\t<ul class=\"button-group\">\r\n\t<li *ngFor=\"let button of message.content.buttons\">\r\n\t\t<button (click)=\"quickReply(button.value)\" type=\"button\">{{ button.title }}</button> \r\n\t\t</li>\r\n\t</ul>\r\n</li>\r\n\t\r\n\t\r\n\t"

/***/ }),

/***/ "./src/app/components/chat/message/messageQuickReply.component.ts":
/*!************************************************************************!*\
  !*** ./src/app/components/chat/message/messageQuickReply.component.ts ***!
  \************************************************************************/
/*! exports provided: MessageQuickReplyComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MessageQuickReplyComponent", function() { return MessageQuickReplyComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_socket_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../services/socket.service */ "./src/app/services/socket.service.ts");



var MessageQuickReplyComponent = /** @class */ (function () {
    function MessageQuickReplyComponent(socketService) {
        this.socketService = socketService;
    }
    MessageQuickReplyComponent.prototype.quickReply = function (message) {
        this.socketService.sendMessageUsingSocket(message);
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", Object)
    ], MessageQuickReplyComponent.prototype, "message", void 0);
    MessageQuickReplyComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-chat-message-quick-reply',
            template: __webpack_require__(/*! ./messageQuickReply.component.html */ "./src/app/components/chat/message/messageQuickReply.component.html"),
            styles: [__webpack_require__(/*! ./message.component.css */ "./src/app/components/chat/message/message.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_socket_service__WEBPACK_IMPORTED_MODULE_2__["SocketService"]])
    ], MessageQuickReplyComponent);
    return MessageQuickReplyComponent;
}());



/***/ }),

/***/ "./src/app/components/chat/message/messageText.component.html":
/*!********************************************************************!*\
  !*** ./src/app/components/chat/message/messageText.component.html ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<li ngClass=\"{}\">Text Type: {{message.type}} - Content {{message.content}}</li>\n\n\n"

/***/ }),

/***/ "./src/app/components/chat/message/messageText.component.ts":
/*!******************************************************************!*\
  !*** ./src/app/components/chat/message/messageText.component.ts ***!
  \******************************************************************/
/*! exports provided: MessageTextComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MessageTextComponent", function() { return MessageTextComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var MessageTextComponent = /** @class */ (function () {
    function MessageTextComponent() {
    }
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", Object)
    ], MessageTextComponent.prototype, "message", void 0);
    MessageTextComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-chat-message-text',
            template: __webpack_require__(/*! ./messageText.component.html */ "./src/app/components/chat/message/messageText.component.html"),
            styles: [__webpack_require__(/*! ./message.component.css */ "./src/app/components/chat/message/message.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [])
    ], MessageTextComponent);
    return MessageTextComponent;
}());



/***/ }),

/***/ "./src/app/components/diary/diary.component.css":
/*!******************************************************!*\
  !*** ./src/app/components/diary/diary.component.css ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvZGlhcnkvZGlhcnkuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/components/diary/diary.component.html":
/*!*******************************************************!*\
  !*** ./src/app/components/diary/diary.component.html ***!
  \*******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "diary works!\n<div *ngFor=\"let release of releases\">\n  {{ release }}\n</div>\n\n"

/***/ }),

/***/ "./src/app/components/diary/diary.component.ts":
/*!*****************************************************!*\
  !*** ./src/app/components/diary/diary.component.ts ***!
  \*****************************************************/
/*! exports provided: DiaryComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DiaryComponent", function() { return DiaryComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_diary_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../services/diary.service */ "./src/app/services/diary.service.ts");



var DiaryComponent = /** @class */ (function () {
    function DiaryComponent(diaryService) {
        this.diaryService = diaryService;
    }
    DiaryComponent.prototype.ngOnInit = function () {
        console.info("init");
        //this.getReleases();
    };
    DiaryComponent.prototype.getReleases = function () {
        var _this = this;
        this.diaryService.getReleases().subscribe(function (data) { _this.releases = data; }, function (err) { return console.error(err); }, function () { return console.log('releases loaded'); });
    };
    DiaryComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-diary',
            template: __webpack_require__(/*! ./diary.component.html */ "./src/app/components/diary/diary.component.html"),
            styles: [__webpack_require__(/*! ./diary.component.css */ "./src/app/components/diary/diary.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_diary_service__WEBPACK_IMPORTED_MODULE_2__["DiaryService"]])
    ], DiaryComponent);
    return DiaryComponent;
}());



/***/ }),

/***/ "./src/app/model/messageText.ts":
/*!**************************************!*\
  !*** ./src/app/model/messageText.ts ***!
  \**************************************/
/*! exports provided: MessageText */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MessageText", function() { return MessageText; });
var MessageText = /** @class */ (function () {
    function MessageText() {
        this.type = "text";
    }
    return MessageText;
}());



/***/ }),

/***/ "./src/app/services/diary.service.ts":
/*!*******************************************!*\
  !*** ./src/app/services/diary.service.ts ***!
  \*******************************************/
/*! exports provided: DiaryService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DiaryService", function() { return DiaryService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");



var httpOptions = {
    headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]({ 'Content-type': 'application/json' })
};
var DiaryService = /** @class */ (function () {
    function DiaryService(http) {
        this.http = http;
    }
    DiaryService.prototype.getReleases = function () {
        return this.http.get('server/api/v1/github/service/releases');
    };
    DiaryService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], DiaryService);
    return DiaryService;
}());



/***/ }),

/***/ "./src/app/services/socket.service.ts":
/*!********************************************!*\
  !*** ./src/app/services/socket.service.ts ***!
  \********************************************/
/*! exports provided: SocketService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SocketService", function() { return SocketService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
/* harmony import */ var _model_messageText__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../model/messageText */ "./src/app/model/messageText.ts");
/* harmony import */ var _stomp_stompjs__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @stomp/stompjs */ "./node_modules/@stomp/stompjs/bundles/stomp.umd.js");
/* harmony import */ var _stomp_stompjs__WEBPACK_IMPORTED_MODULE_5___default = /*#__PURE__*/__webpack_require__.n(_stomp_stompjs__WEBPACK_IMPORTED_MODULE_5__);
/* harmony import */ var sockjs_client__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! sockjs-client */ "./node_modules/sockjs-client/lib/entry.js");
/* harmony import */ var sockjs_client__WEBPACK_IMPORTED_MODULE_6___default = /*#__PURE__*/__webpack_require__.n(sockjs_client__WEBPACK_IMPORTED_MODULE_6__);
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");








var SocketService = /** @class */ (function () {
    function SocketService(http) {
        this.http = http;
        this.serverUrl = _environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].url + 'socket';
        this.url = _environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].url + "api/v1/socket";
        this.fromId = "123";
        this.isLoaded = false;
        this.isCustomSocketOpened = false;
        this.messages = [];
        console.log("Connection to socket " + _environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].url + "socket");
        var ws = new sockjs_client__WEBPACK_IMPORTED_MODULE_6__(this.serverUrl);
        this.stompClient = _stomp_stompjs__WEBPACK_IMPORTED_MODULE_5__["Stomp"].over(ws);
        var that = this;
        this.stompClient.connect({}, function (frame) {
            console.log("Connected");
            that.isLoaded = true;
            that.openGlobalSocket();
            that.openPrivateSocket();
        }, function () {
            console.log("error");
        });
    }
    SocketService.prototype.post = function (data) {
        return this.http.post(this.url, data);
    };
    SocketService.prototype.getMessages = function () {
        return Object(rxjs__WEBPACK_IMPORTED_MODULE_7__["of"])(this.messages);
    };
    SocketService.prototype.sendMessageUsingSocket = function (content) {
        var message = new _model_messageText__WEBPACK_IMPORTED_MODULE_4__["MessageText"]();
        message.content = content;
        message.fromId = this.fromId;
        this.stompClient.send("/socket-subscriber/send/message", {}, JSON.stringify(message));
    };
    SocketService.prototype.openGlobalSocket = function () {
        var _this = this;
        this.stompClient.subscribe("/socket-publisher", function (message) {
            _this.handleResult(message);
        });
    };
    SocketService.prototype.openPrivateSocket = function () {
        var _this = this;
        if (this.isLoaded) {
            this.isCustomSocketOpened = true;
            this.stompClient.subscribe("/socket-publisher/" + this.fromId, function (message) {
                _this.handleResult(message);
            });
        }
    };
    SocketService.prototype.handleResult = function (response) {
        console.log(response);
        if (response.body) {
            var message = JSON.parse(response.body);
            switch (message.type) {
                case "text":
                    var messageText = message;
                    this.messages.push(messageText);
                    break;
                case "buttons":
                    var messageButtons = message;
                    this.messages.push(messageButtons);
                    break;
                case "quickReplies":
                    var messageQuickReply = message;
                    this.messages.push(messageQuickReply);
                    break;
                default:
                    var defaultMessage = new _model_messageText__WEBPACK_IMPORTED_MODULE_4__["MessageText"]();
                    defaultMessage.content = "error";
                    this.messages.push(defaultMessage);
                    break;
            }
        }
    };
    SocketService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({ providedIn: 'root' }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], SocketService);
    return SocketService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false,
    url: "http://localhost:5000/"
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\cheynierj\portfolio-ui\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map