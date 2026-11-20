
def call() {
    stage('Build') {
        echo 'Shared Library: Build completed'
    }
    stage('Test') {
        echo 'Shared Library: Test completed'
    }
}
