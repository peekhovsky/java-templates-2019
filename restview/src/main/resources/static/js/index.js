let messageApi = Vue.resource('/users/{/id}');

Vue.component('message-row', {
    props: ['message'],
    template: '<div>{{ message.firstName }} {{ message.lastName }}</div>'
});

Vue.component('messages-list', {
    props: ['messages'],
    template: '<div>'
        + '<message-row v-for="message in messages" :key="message.id" :message="message"/>'
        + '</div>',
    created: function () {
        messageApi.get().then(result =>
            result.json().then(data =>
                data.forEach(message =>
                    this.messages.push(message)
                )
            )
        )
    }
});

new Vue({
    el: '#app',
    template: '<messages-list :messages="messages"/>',
    data: {
        messages: []
    }
});