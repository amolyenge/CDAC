import PassGenerator from './PassGenerator'
import Counter from './Counter'
import Counter1 from './Counter1'
import Counter2 from './Counter2'
import ErrorBoundary from './ErrorBoundry'

function App() {
  return (
    <div>
        {/* <PassGenerator/> */}
{/* 
        <ErrorBoundary>
           <Counter></Counter>
        </ErrorBoundary> */}

     {/*<ErrorBoundary>
           <Counter1></Counter1>
        </ErrorBoundary> */}

        <ErrorBoundary>
           <Counter2></Counter2>
        </ErrorBoundary>

    </div>
  );
}

export default App;
